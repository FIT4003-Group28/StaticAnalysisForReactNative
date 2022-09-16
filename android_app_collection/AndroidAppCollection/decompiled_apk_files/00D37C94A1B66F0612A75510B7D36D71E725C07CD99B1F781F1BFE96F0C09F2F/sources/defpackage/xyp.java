package defpackage;
/* compiled from: PG */
/* renamed from: xyp  reason: default package */
/* loaded from: classes4.dex */
public final class xyp {
    public aoob a;

    public final awhi a() {
        aopa createBuilder = awhi.a.createBuilder();
        aoob aoobVar = this.a;
        if (aoobVar != null) {
            createBuilder.copyOnWrite();
            awhi awhiVar = (awhi) createBuilder.instance;
            awhiVar.b |= 1;
            awhiVar.c = aoobVar;
        }
        return (awhi) createBuilder.mo39build();
    }
}
