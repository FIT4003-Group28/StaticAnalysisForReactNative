package defpackage;

import java.util.Collection;
import java.util.Map;
/* compiled from: PG */
/* renamed from: amjh  reason: default package */
/* loaded from: classes.dex */
public final class amjh implements akuc {
    public final int a;
    private final Map<dmpn, akud> b;

    public amjh(Map<dmpn, akud> map, int i) {
        this.b = map;
        this.a = i;
    }

    @Override // defpackage.akuc
    public final Collection<akud> a() {
        return this.b.values();
    }

    @Override // defpackage.akuc
    @dzsi
    public final akud b(dmpn dmpnVar) {
        return this.b.get(dmpnVar);
    }

    @Override // defpackage.akuc
    public final int c() {
        return this.a;
    }
}
