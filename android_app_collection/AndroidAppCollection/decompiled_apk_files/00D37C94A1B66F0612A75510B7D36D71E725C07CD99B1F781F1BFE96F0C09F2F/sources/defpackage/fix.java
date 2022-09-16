package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: fix  reason: default package */
/* loaded from: classes3.dex */
final class fix extends FrameLayout implements SeekBar.OnSeekBarChangeListener, View.OnTouchListener {
    public final SeekBar a;
    public axnm b;
    public awmt c;
    public teb d;

    public fix(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.default_seek_bar, this);
        SeekBar seekBar = (SeekBar) findViewById(R.id.slider_seek_bar);
        this.a = seekBar;
        seekBar.setOnSeekBarChangeListener(this);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (!z || this.c == null) {
            return;
        }
        axnm axnmVar = this.b;
        if (axnmVar == null || axnmVar.get() == null) {
            this.d.b(31, "OnChangeCommand provided but no usable command resolver found.");
            return;
        }
        tcq a = tcs.a();
        a.a = this;
        aopc aopcVar = (aopc) awon.a.createBuilder();
        aopg aopgVar = awss.b;
        aopa createBuilder = awss.a.createBuilder();
        createBuilder.copyOnWrite();
        awss awssVar = (awss) createBuilder.instance;
        awssVar.c = 1;
        awssVar.d = Integer.valueOf(i);
        aopcVar.e(aopgVar, (awss) createBuilder.mo39build());
        a.e = (awon) aopcVar.mo39build();
        ((tcu) this.b.get()).b(this.c, a.a()).T();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.a.onTouchEvent(motionEvent);
    }
}
