package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: anyk  reason: default package */
/* loaded from: classes.dex */
public final class anyk extends anxk {
    public final Set a;
    public final anxo b;
    private final Set c;
    private final Set d;

    public anyk(anxn anxnVar, anxo anxoVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (anxy anxyVar : anxnVar.b) {
            if (!anxyVar.d()) {
                if (!anxyVar.e()) {
                    hashSet2.add(anxyVar.a);
                } else {
                    hashSet5.add(anxyVar.a);
                }
            } else if (!anxyVar.e()) {
                hashSet.add(anxyVar.a);
            } else {
                hashSet4.add(anxyVar.a);
            }
        }
        if (!anxnVar.e.isEmpty()) {
            hashSet.add(anzg.class);
        }
        this.c = Collections.unmodifiableSet(hashSet);
        this.d = Collections.unmodifiableSet(hashSet2);
        Collections.unmodifiableSet(hashSet3);
        this.a = Collections.unmodifiableSet(hashSet4);
        Collections.unmodifiableSet(hashSet5);
        Set set = anxnVar.e;
        this.b = anxoVar;
    }

    @Override // defpackage.anxk, defpackage.anxo
    public final Object a(Class cls) {
        if (!this.c.contains(cls)) {
            throw new anya(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        Object a = this.b.a(cls);
        if (!cls.equals(anzg.class)) {
            return a;
        }
        anzg anzgVar = (anzg) a;
        return new anyj();
    }

    @Override // defpackage.anxo
    public final aoaf b(Class cls) {
        if (!this.d.contains(cls)) {
            throw new anya(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
        }
        return this.b.b(cls);
    }

    @Override // defpackage.anxo
    public final aoaf c(Class cls) {
        throw null;
    }
}
