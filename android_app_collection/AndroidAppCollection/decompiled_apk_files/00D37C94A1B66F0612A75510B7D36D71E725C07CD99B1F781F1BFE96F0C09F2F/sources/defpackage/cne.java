package defpackage;

import java.io.File;
/* compiled from: PG */
/* renamed from: cne  reason: default package */
/* loaded from: classes2.dex */
public final class cne implements cnq {
    private final cnc a;

    public cne(cnc cncVar) {
        this.a = cncVar;
    }

    @Override // defpackage.cnq
    public final /* bridge */ /* synthetic */ cnp a(Object obj, int i, int i2, cic cicVar) {
        File file = (File) obj;
        return new cnp(new cup(file), new cnb(file, this.a));
    }

    @Override // defpackage.cnq
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        File file = (File) obj;
        return true;
    }
}
