package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ziq  reason: default package */
/* loaded from: classes4.dex */
public final class ziq implements zje {
    private final aavr a;
    private final zjb b;
    private final Map c;

    public ziq(aavr aavrVar, zjb zjbVar) {
        aavrVar.getClass();
        this.a = aavrVar;
        zjbVar.getClass();
        this.b = zjbVar;
        this.c = new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x0361 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x015c A[EDGE_INSN: B:164:0x015c->B:85:0x015c ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.aqkf r18) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ziq.a(aqkf):void");
    }

    @Override // defpackage.zje
    public final void b(Collection collection) {
        c(collection, null);
    }

    @Override // defpackage.zje
    public final void c(Collection collection, zis zisVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((Uri) it.next()).toString());
        }
        this.a.a(arrayList, new zip(this, collection, zisVar));
    }
}
