package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aakq  reason: default package */
/* loaded from: classes2.dex */
public class aakq implements aakr {
    private final List<aaks<? extends aakt>> a = new ArrayList();

    public aakq Pc(aaks<? extends aakt> aaksVar) {
        this.a.add(aaksVar);
        return this;
    }

    @Override // defpackage.aakr
    public List<aaks<? extends aakt>> a() {
        return this.a;
    }

    @Override // defpackage.aakt
    public Boolean c() {
        return false;
    }
}
