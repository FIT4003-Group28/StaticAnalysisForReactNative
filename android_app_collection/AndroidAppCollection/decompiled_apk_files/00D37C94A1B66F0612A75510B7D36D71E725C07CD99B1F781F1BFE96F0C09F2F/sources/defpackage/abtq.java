package defpackage;

import android.text.Spanned;
/* compiled from: PG */
/* renamed from: abtq  reason: default package */
/* loaded from: classes.dex */
public final class abtq implements Runnable {
    final /* synthetic */ abtt a;
    final /* synthetic */ abxl b;

    public abtq(abtt abttVar, abxl abxlVar) {
        this.a = abttVar;
        this.b = abxlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.a.c);
        String.valueOf(valueOf).length();
        String.valueOf(valueOf2).length();
        abxl abxlVar = this.b;
        abts abtsVar = this.a.c;
        abyk abykVar = abxlVar.a;
        if (abtsVar == null || !abykVar.U) {
            return;
        }
        Spanned spanned = abtsVar.b;
        String obj = spanned == null ? null : spanned.toString();
        String valueOf3 = String.valueOf(obj);
        if (valueOf3.length() != 0) {
            "onHealthStatusChanged: ".concat(valueOf3);
        }
        if (abtsVar.a == 2) {
            abykVar.m(abyi.BAD, obj);
        } else {
            abykVar.m(abyi.GOOD, obj);
        }
    }
}
