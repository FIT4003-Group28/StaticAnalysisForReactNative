package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: ljr  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ljr implements ayqb {
    public final /* synthetic */ lju a;
    private final /* synthetic */ int b;

    public /* synthetic */ ljr(lju ljuVar, int i) {
        this.b = i;
        this.a = ljuVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            azpk azpkVar = (azpk) obj;
            this.a.a((ampq) ((List) azpkVar.a).get(0), (ampq) ((List) azpkVar.a).get(1), azpkVar.b);
            return;
        }
        azpk azpkVar2 = (azpk) obj;
        this.a.a((ampq) ((List) azpkVar2.a).get(0), (ampq) ((List) azpkVar2.a).get(1), azpkVar2.b);
    }
}
