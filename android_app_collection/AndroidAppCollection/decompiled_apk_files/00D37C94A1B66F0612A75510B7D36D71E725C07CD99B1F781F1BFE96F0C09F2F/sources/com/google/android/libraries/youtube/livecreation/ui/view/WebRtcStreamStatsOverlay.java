package com.google.android.libraries.youtube.livecreation.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class WebRtcStreamStatsOverlay extends RelativeLayout {
    public WebRtcStreamStatsOverlay(Context context) {
        super(context);
        a(context);
    }

    private final void a(Context context) {
        inflate(context, R.layout.lc_webrtc_stream_stats_overlay, this);
        setSaveEnabled(true);
        TextView textView = (TextView) findViewById(R.id.stats_video_input);
        TextView textView2 = (TextView) findViewById(R.id.stats_video_output);
        TextView textView3 = (TextView) findViewById(R.id.stats_video_bandwidth_limited);
        TextView textView4 = (TextView) findViewById(R.id.stats_video_cpu_limited);
        TextView textView5 = (TextView) findViewById(R.id.stats_video_average_encode_ms);
        TextView textView6 = (TextView) findViewById(R.id.stats_video_bitrate);
        TextView textView7 = (TextView) findViewById(R.id.stats_video_bytes_sent);
        TextView textView8 = (TextView) findViewById(R.id.stats_video_adaptation_changes);
        TextView textView9 = (TextView) findViewById(R.id.stats_video_codec);
        TextView textView10 = (TextView) findViewById(R.id.stats_video_buffer_mode);
        TextView textView11 = (TextView) findViewById(R.id.stats_audio_input_level);
        TextView textView12 = (TextView) findViewById(R.id.stats_audio_bytes_sent);
        TextView textView13 = (TextView) findViewById(R.id.stats_audio_codec);
    }

    public WebRtcStreamStatsOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public WebRtcStreamStatsOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }
}
