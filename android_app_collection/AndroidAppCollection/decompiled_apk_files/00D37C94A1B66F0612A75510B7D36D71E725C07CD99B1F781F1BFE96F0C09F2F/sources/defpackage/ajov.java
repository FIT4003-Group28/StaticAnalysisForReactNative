package defpackage;

import java.io.File;
/* compiled from: PG */
/* renamed from: ajov  reason: default package */
/* loaded from: classes.dex */
public final class ajov implements cnq {
    private final ajox a;
    private final cnq b;

    public ajov(ajox ajoxVar, cnq cnqVar) {
        this.a = ajoxVar;
        this.b = cnqVar;
    }

    @Override // defpackage.cnq
    public final /* bridge */ /* synthetic */ cnp a(Object obj, int i, int i2, cic cicVar) {
        return this.b.a(new File(zgh.h(this.a.a(((cnf) obj).b()))), i, i2, cicVar);
    }

    @Override // defpackage.cnq
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return this.a.a(((cnf) obj).b()) != null;
    }
}
