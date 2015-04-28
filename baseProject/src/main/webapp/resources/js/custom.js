jQuery(function($) {
	$('[data-rel=tooltip]').tooltip();
	$('.aa-tooltip').tooltip();
	$('[data-rel=popover]').popover({
		html : true
	});
});

function openTab(index) {
	$('#aa-tabs li[class="active"]').removeClass('active');
	$('#aa-tab' + index).addClass('active');
}

function openStep(index) {
	$('.steps li[class="active"]').removeClass('active');
	$('#step' + index).addClass('active');
}

jQuery(function($) {
	$('.scrollable').each(function() {
		var $this = $(this);
		$(this).ace_scroll({
			size : $this.attr('data-size') || 100,
		// styleClass: 'scroll-left scroll-margin scroll-thin scroll-dark
		// scroll-light no-track scroll-visible'
		});
	});
	$('.easy-pie-chart.percentage')
			.each(
					function() {
						var $box = $(this).closest('.infobox');
						var barColor = $(this).data('color')
								|| (!$box.hasClass('infobox-dark') ? $box
										.css('color')
										: 'rgba(255,255,255,0.95)');
						var trackColor = barColor == 'rgba(255,255,255,0.95)' ? 'rgba(255,255,255,0.25)'
								: '#E2E2E2';
						var size = parseInt($(this).data('size')) || 50;
						var $this = $(this);
						$(this).easyPieChart(
								{
									barColor : barColor,
									trackColor : trackColor,
									scaleColor : false,
									lineCap : 'butt',
									lineWidth : parseInt(size / 10),
									animate : /msie\s*(8|7|6)/
											.test(navigator.userAgent
													.toLowerCase()) ? false
											: 1000,
									size : size
								});
					});
});


