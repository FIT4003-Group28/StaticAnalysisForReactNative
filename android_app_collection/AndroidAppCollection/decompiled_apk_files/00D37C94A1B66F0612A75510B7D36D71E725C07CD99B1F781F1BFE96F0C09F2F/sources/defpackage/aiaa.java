package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: aiaa  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aiaa implements ayqb {
    public final /* synthetic */ aiad a;
    private final /* synthetic */ int b;

    public /* synthetic */ aiaa(aiad aiadVar, int i, byte[] bArr) {
        this.b = i;
        this.a = aiadVar;
    }

    public /* synthetic */ aiaa(aiad aiadVar, byte[] bArr) {
        this.a = aiadVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            aiad aiadVar = this.a;
            Object[] objArr = (Object[]) obj;
            afkn afknVar = (afkn) objArr[1];
            String Z = ((ajff) objArr[0]).Z();
            if (!aiadVar.a.r.containsKey(Z)) {
                aiadVar.a.r.put(Z, new ArrayList());
            }
            ((ArrayList) aiadVar.a.r.get(Z)).add(afknVar);
            return;
        }
        this.a.a.r.remove(((ahie) obj).b());
    }
}
