package com.google.android.libraries.youtube.edit.preview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Set;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class EditableVideoControllerView extends vtq {
    private final ImageView f;

    public EditableVideoControllerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.editable_video_controller_view, (ViewGroup) this, true);
        h((TextView) findViewById(R.id.play_position_text), (TextView) findViewById(R.id.video_duration_text), (SeekBar) findViewById(R.id.play_progress_bar));
        ImageView imageView = (ImageView) findViewById(R.id.play_button);
        this.f = imageView;
        imageView.setOnClickListener(new vtp(this));
    }

    @Override // defpackage.vtq, defpackage.vqs
    public final void a(vqr vqrVar, Set set) {
        super.a(vqrVar, set);
        setVisibility(4);
    }

    @Override // defpackage.vtq, defpackage.vqs
    public final void c(vqr vqrVar, Set set) {
        super.c(vqrVar, set);
        setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.vtq
    public final void q() {
        if (u()) {
            this.f.setImageResource(2131231763);
            this.f.setContentDescription(getContext().getString(R.string.edit_pause_button_content_description));
            return;
        }
        this.f.setImageResource(2131231764);
        this.f.setContentDescription(getContext().getString(R.string.edit_play_button_content_description));
    }
}
