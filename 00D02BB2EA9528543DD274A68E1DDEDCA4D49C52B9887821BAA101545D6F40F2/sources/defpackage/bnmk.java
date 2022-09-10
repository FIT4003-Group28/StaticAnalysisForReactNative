package defpackage;

import android.content.SharedPreferences;
/* compiled from: PG */
/* renamed from: bnmk  reason: default package */
/* loaded from: classes3.dex */
final class bnmk implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ long b;
    final /* synthetic */ dvev c;
    final /* synthetic */ bnmm d;

    public bnmk(bnmm bnmmVar, String str, long j, dvev dvevVar) {
        this.d = bnmmVar;
        this.a = str;
        this.b = j;
        this.c = dvevVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SharedPreferences sharedPreferences = this.d.t;
        if (sharedPreferences == null || !sharedPreferences.edit().putLong(this.a, this.b).commit()) {
            return;
        }
        int size = this.d.a.size();
        bnmm bnmmVar = this.d;
        if (size == ((dbye) bnmmVar.b).b) {
            bnmmVar.q = true;
        }
        bnmmVar.k.b(new bnml(bnmmVar, this.c), bvrj.UI_THREAD);
    }
}
