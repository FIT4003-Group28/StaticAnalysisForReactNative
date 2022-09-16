package defpackage;

import java.util.ArrayList;
import java.util.Collections;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amst  reason: default package */
/* loaded from: classes2.dex */
public final class amst {
    public static final void a(amsv amsvVar, ArrayList arrayList) {
        if (amsvVar instanceof amss) {
            Collections.addAll(arrayList, ((amss) amsvVar).a);
        } else {
            arrayList.add(amsvVar);
        }
    }
}
