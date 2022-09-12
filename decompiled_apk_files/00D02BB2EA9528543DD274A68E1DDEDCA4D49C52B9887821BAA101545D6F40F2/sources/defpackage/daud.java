package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: daud  reason: default package */
/* loaded from: classes5.dex */
public final class daud implements Iterator<Map.Entry<String, Object>> {
    final /* synthetic */ dauf a;
    private int b = -1;
    private dauh c;
    private Object d;
    private boolean e;
    private boolean f;
    private dauh g;

    public daud(dauf daufVar) {
        this.a = daufVar;
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public final Map.Entry<String, Object> next() {
        if (hasNext()) {
            this.g = this.c;
            Object obj = this.d;
            this.f = false;
            this.e = false;
            this.c = null;
            this.d = null;
            return new dauc(this.a, this.g, obj);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f) {
            this.f = true;
            this.d = null;
            while (this.d == null) {
                int i = this.b + 1;
                this.b = i;
                if (i >= this.a.b.d.size()) {
                    break;
                }
                daty datyVar = this.a.b;
                dauh c = datyVar.c(datyVar.d.get(this.b));
                this.c = c;
                this.d = c.e(this.a.a);
            }
        }
        return this.d != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z = false;
        if (this.g != null && !this.e) {
            z = true;
        }
        dbsk.l(z);
        this.e = true;
        this.g.f(this.a.a, null);
    }
}
