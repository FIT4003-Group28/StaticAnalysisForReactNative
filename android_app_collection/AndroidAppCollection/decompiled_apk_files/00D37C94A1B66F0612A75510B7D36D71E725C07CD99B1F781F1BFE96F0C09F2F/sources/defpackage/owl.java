package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: owl  reason: default package */
/* loaded from: classes4.dex */
public final class owl extends owm {
    public final Uri a;
    public final long b;
    public final owj c;
    private final owe j;

    public owl(String str, long j, ovm ovmVar, owr owrVar, String str2, long j2, String str3) {
        super(str, j, ovmVar, str3, owrVar, str2);
        this.a = Uri.parse(str3);
        long j3 = owrVar.b;
        owe oweVar = null;
        owj owjVar = j3 <= 0 ? null : new owj(null, owrVar.a, j3);
        this.c = owjVar;
        this.b = j2;
        this.j = owjVar == null ? new owe(new owj("", 0L, j2)) : oweVar;
    }

    @Override // defpackage.owm
    public final ovy h() {
        return this.j;
    }

    @Override // defpackage.owm
    public final owj i() {
        return this.c;
    }
}
