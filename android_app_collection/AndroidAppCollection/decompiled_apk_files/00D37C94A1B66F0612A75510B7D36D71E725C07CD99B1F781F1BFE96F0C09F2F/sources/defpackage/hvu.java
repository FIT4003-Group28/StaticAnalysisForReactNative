package defpackage;

import android.widget.SeekBar;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hvu  reason: default package */
/* loaded from: classes3.dex */
public final class hvu implements SeekBar.OnSeekBarChangeListener {
    final /* synthetic */ hvy a;

    public hvu(hvy hvyVar) {
        this.a = hvyVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.a.k.setTextSize(2, i + 12.0f);
        this.a.j();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
