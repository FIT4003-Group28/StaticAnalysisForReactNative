package defpackage;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: czjk  reason: default package */
/* loaded from: classes5.dex */
public final class czjk implements czie<OutputStream> {
    private czjk() {
    }

    public static czjk b() {
        return new czjk();
    }

    @Override // defpackage.czie
    public final /* bridge */ /* synthetic */ OutputStream a(czid czidVar) {
        OutputStream d = czidVar.a.d(czidVar.e);
        ArrayList arrayList = new ArrayList();
        arrayList.add(d);
        if (!czidVar.c.isEmpty()) {
            List<czjp> list = czidVar.c;
            ArrayList arrayList2 = new ArrayList();
            for (czjp czjpVar : list) {
                czjo b = czjpVar.b();
                if (b != null) {
                    arrayList2.add(b);
                }
            }
            czib czibVar = !arrayList2.isEmpty() ? new czib(d, arrayList2) : null;
            if (czibVar != null) {
                arrayList.add(czibVar);
            }
        }
        for (czjq czjqVar : czidVar.b) {
            OutputStream outputStream = (OutputStream) dcft.s(arrayList);
            arrayList.add(czjqVar.d());
        }
        Collections.reverse(arrayList);
        for (czio czioVar : czidVar.f) {
            OutputStream outputStream2 = (OutputStream) dcft.s(arrayList);
            if (outputStream2 instanceof cziy) {
                czioVar.b = (cziy) outputStream2;
                czioVar.a = (OutputStream) arrayList.iterator().next();
            }
        }
        return (OutputStream) arrayList.get(0);
    }
}
