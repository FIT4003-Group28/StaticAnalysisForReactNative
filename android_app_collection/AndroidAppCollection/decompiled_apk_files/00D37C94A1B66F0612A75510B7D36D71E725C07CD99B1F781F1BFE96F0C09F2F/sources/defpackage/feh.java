package defpackage;

import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: PG */
/* renamed from: feh  reason: default package */
/* loaded from: classes3.dex */
public final class feh {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    public boolean b;

    public final void a(feg fegVar) {
        if (fegVar == null) {
            return;
        }
        this.a.add(fegVar);
    }

    public final void b(feg fegVar) {
        if (fegVar == null) {
            return;
        }
        this.a.remove(fegVar);
    }
}
