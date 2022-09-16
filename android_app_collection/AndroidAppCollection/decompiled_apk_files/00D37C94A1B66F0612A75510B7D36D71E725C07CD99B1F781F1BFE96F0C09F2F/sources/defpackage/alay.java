package defpackage;

import android.text.TextUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alay  reason: default package */
/* loaded from: classes.dex */
public final class alay implements Comparable {
    final afvm a;
    final String b;
    final String c;
    final long d;
    final String e;
    final int f;

    public alay(afvm afvmVar, String str, String str2, long j, String str3) {
        this(afvmVar, str, str2, j, str3, 0);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return (this.d > ((alay) obj).d ? 1 : (this.d == ((alay) obj).d ? 0 : -1));
    }

    public alay(afvm afvmVar, String str, String str2, long j, String str3, int i) {
        boolean z = true;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            z = false;
        }
        aqxo.p(z);
        this.a = afvmVar;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = str3;
        this.f = i;
    }
}
