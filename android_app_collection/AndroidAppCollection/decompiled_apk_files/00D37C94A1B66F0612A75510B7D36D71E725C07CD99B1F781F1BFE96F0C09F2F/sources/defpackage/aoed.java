package defpackage;

import java.util.Collection;
import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: aoed  reason: default package */
/* loaded from: classes.dex */
public final class aoed extends ancg {
    private final Collection a;

    public aoed(String str, Collection collection) {
        super(str);
        this.a = collection;
    }

    @Override // defpackage.anbf
    public final void c(anbe anbeVar) {
        amzt listIterator = ((amuk) this.a).listIterator();
        while (listIterator.hasNext()) {
            anbf anbfVar = (anbf) listIterator.next();
            if (anbeVar.x() || anbfVar.d(anbeVar.m())) {
                anbfVar.c(anbeVar);
            }
        }
    }

    @Override // defpackage.anbf
    public final boolean d(Level level) {
        amzt listIterator = ((amuk) this.a).listIterator();
        while (listIterator.hasNext()) {
            if (((anbf) listIterator.next()).d(level)) {
                return true;
            }
        }
        return false;
    }
}
