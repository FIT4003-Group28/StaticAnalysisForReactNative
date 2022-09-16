package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: acvt  reason: default package */
/* loaded from: classes.dex */
final class acvt implements ynj {
    final /* synthetic */ acvz a;
    private final acvm b;

    public acvt(acvz acvzVar, acvm acvmVar) {
        this.a = acvzVar;
        acvmVar.getClass();
        this.b = acvmVar;
    }

    @Override // defpackage.ynj
    public final void a(Object obj) {
        Map a = this.b.a(obj);
        if (a == null || a.isEmpty()) {
            return;
        }
        if (!this.a.a.isEmpty()) {
            for (acvk acvkVar : this.a.a) {
                for (Map.Entry entry : a.entrySet()) {
                    acvkVar.g((String) entry.getKey(), (String) entry.getValue());
                }
            }
        }
        if (this.a.b.isEmpty()) {
            return;
        }
        for (acvk acvkVar2 : this.a.b) {
            for (Map.Entry entry2 : a.entrySet()) {
                acvkVar2.g((String) entry2.getKey(), (String) entry2.getValue());
            }
        }
    }
}
