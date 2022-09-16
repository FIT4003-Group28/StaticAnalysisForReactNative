package defpackage;

import java.util.Collections;
/* compiled from: PG */
/* renamed from: alan  reason: default package */
/* loaded from: classes.dex */
public final class alan extends aarb {
    public alan(aaqf aaqfVar, afvm afvmVar, aopa aopaVar) {
        super(aaqfVar, afvmVar, "upload/feedback", aopaVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        aopa aopaVar = (aopa) a();
        aqxo.z(((asfk) aopaVar.instance).d.size() + ((asfk) aopaVar.instance).e.size() > 0, "Empty feedback polling request");
        for (avup avupVar : Collections.unmodifiableList(((asfk) aopaVar.instance).d)) {
            aqxo.z((avupVar.c.isEmpty() ^ 1) + (avupVar.d.isEmpty() ^ 1) == 1, "Exactly one feedback id needs to be specified");
        }
        for (String str : Collections.unmodifiableList(((asfk) aopaVar.instance).e)) {
            aqxo.z(!str.isEmpty(), "Empty feedback continuation");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final boolean n() {
        return false;
    }
}
