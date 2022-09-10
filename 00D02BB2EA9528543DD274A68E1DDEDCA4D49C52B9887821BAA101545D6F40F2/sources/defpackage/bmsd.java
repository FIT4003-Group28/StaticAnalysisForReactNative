package defpackage;

import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: bmsd  reason: default package */
/* loaded from: classes3.dex */
public abstract class bmsd {
    public static bmsd b() {
        return c(dcdc.e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bmsd c(dcdc<bmsg> dcdcVar) {
        dcpe<bmsg> listIterator = dcdcVar.listIterator();
        if (listIterator.hasNext()) {
            bmsg next = listIterator.next();
            while (listIterator.hasNext()) {
                bmsg next2 = listIterator.next();
                dbsk.a(next.b().x(next2.b()));
                next = next2;
            }
        }
        return d(dcdcVar);
    }

    public static bmsd d(dcdc<bmsg> dcdcVar) {
        return new bmrx(dcdcVar);
    }

    public abstract dcdc<bmsg> a();

    public final bmsg e() {
        if (a().isEmpty()) {
            throw new NoSuchElementException("empty");
        }
        return a().get(0);
    }
}
