package defpackage;

import java.io.InputStream;
/* compiled from: PG */
/* renamed from: aftu  reason: default package */
/* loaded from: classes.dex */
public final class aftu extends aftk implements aftr {
    protected final zie a;
    private final zib b;

    public aftu(zie zieVar) {
        zieVar.getClass();
        this.a = zieVar;
        this.b = aiwv.e();
    }

    @Override // defpackage.aftr
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        aiwi aiwiVar = (aiwi) obj;
        zgh.m(aiwiVar.a.i());
        return yqv.b(aiwiVar.a.h()).a();
    }

    @Override // defpackage.aftk
    protected final Object g(InputStream inputStream) {
        try {
            return ((afwf) this.a.b(inputStream, this.b)).a();
        } catch (Exception e) {
            throw new zhy(e);
        }
    }
}
