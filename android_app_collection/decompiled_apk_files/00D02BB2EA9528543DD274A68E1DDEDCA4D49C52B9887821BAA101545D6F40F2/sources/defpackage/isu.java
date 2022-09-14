package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/* compiled from: PG */
/* renamed from: isu  reason: default package */
/* loaded from: classes.dex */
public class isu {
    public final Random a;
    public final iwc b;
    public List<ize> c;
    public final List<String> d;
    public final boolean e;

    public isu(btvo btvoVar, iwc iwcVar) {
        Random random = new Random();
        this.c = new ArrayList();
        this.a = random;
        this.b = iwcVar;
        this.d = btvoVar.getSearchParameters().c();
        this.e = btvoVar.getSearchParameters().n() == 4;
    }
}
