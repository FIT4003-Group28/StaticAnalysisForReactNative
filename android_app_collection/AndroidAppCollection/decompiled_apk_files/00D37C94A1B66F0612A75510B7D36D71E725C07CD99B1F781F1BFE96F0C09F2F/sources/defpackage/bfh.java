package defpackage;

import android.widget.SeekBar;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bfh  reason: default package */
/* loaded from: classes2.dex */
public final class bfh extends kt {
    final /* synthetic */ bfl a;

    public bfh(bfl bflVar) {
        this.a = bflVar;
    }

    @Override // defpackage.kt
    public final void t(bhc bhcVar) {
        this.a.o(true);
    }

    @Override // defpackage.kt
    public final void v() {
        this.a.o(false);
    }

    @Override // defpackage.kt
    public final void w(bhc bhcVar) {
        SeekBar seekBar = (SeekBar) this.a.B.get(bhcVar);
        int i = bhcVar.n;
        if (seekBar == null || this.a.w == bhcVar) {
            return;
        }
        seekBar.setProgress(i);
    }
}
