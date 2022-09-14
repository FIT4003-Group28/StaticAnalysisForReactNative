package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ahl  reason: default package */
/* loaded from: classes.dex */
public final class ahl extends ahn implements Iterator<Map.Entry> {
    final /* synthetic */ aho a;
    private ahk b;
    private boolean c = true;

    public ahl(aho ahoVar) {
        this.a = ahoVar;
    }

    @Override // defpackage.ahn
    public final void Na(ahk ahkVar) {
        ahk ahkVar2 = this.b;
        if (ahkVar == ahkVar2) {
            ahk<K, V> ahkVar3 = ahkVar2.d;
            this.b = ahkVar3;
            this.c = ahkVar3 == 0;
        }
    }

    @Override // java.util.Iterator
    /* renamed from: b */
    public final Map.Entry next() {
        ahk ahkVar;
        if (this.c) {
            this.c = false;
            ahkVar = this.a.b;
        } else {
            ahk ahkVar2 = this.b;
            ahkVar = ahkVar2 != null ? ahkVar2.c : null;
        }
        this.b = ahkVar;
        return this.b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c) {
            return this.a.b != null;
        }
        ahk ahkVar = this.b;
        return (ahkVar == null || ahkVar.c == null) ? false : true;
    }
}
