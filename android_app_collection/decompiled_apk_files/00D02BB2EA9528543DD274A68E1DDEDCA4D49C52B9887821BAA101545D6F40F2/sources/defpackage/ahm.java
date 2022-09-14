package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ahm  reason: default package */
/* loaded from: classes.dex */
abstract class ahm<K, V> extends ahn<K, V> implements Iterator<Map.Entry<K, V>> {
    ahk<K, V> a;
    ahk<K, V> b;

    public ahm(ahk<K, V> ahkVar, ahk<K, V> ahkVar2) {
        this.a = ahkVar2;
        this.b = ahkVar;
    }

    private final ahk<K, V> c() {
        ahk<K, V> ahkVar = this.b;
        ahk<K, V> ahkVar2 = this.a;
        if (ahkVar == ahkVar2 || ahkVar2 == null) {
            return null;
        }
        return a(ahkVar);
    }

    @Override // defpackage.ahn
    public final void Na(ahk<K, V> ahkVar) {
        if (this.a == ahkVar && ahkVar == this.b) {
            this.b = null;
            this.a = null;
        }
        ahk<K, V> ahkVar2 = this.a;
        if (ahkVar2 == ahkVar) {
            this.a = b(ahkVar2);
        }
        if (this.b == ahkVar) {
            this.b = c();
        }
    }

    public abstract ahk<K, V> a(ahk<K, V> ahkVar);

    public abstract ahk<K, V> b(ahk<K, V> ahkVar);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        ahk<K, V> ahkVar = this.b;
        this.b = c();
        return ahkVar;
    }
}
