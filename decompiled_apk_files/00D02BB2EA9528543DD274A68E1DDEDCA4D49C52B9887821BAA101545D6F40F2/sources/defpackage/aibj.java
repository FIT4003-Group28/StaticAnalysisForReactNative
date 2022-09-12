package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: aibj  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class aibj {
    private final aibo a;

    public aibj(aibo aiboVar) {
        this.a = aiboVar;
    }

    public final void a(aibb aibbVar) {
        aibo aiboVar = this.a;
        dbsk.m(aibbVar == aiboVar.g, "pending share is expected to be the same");
        aiboVar.g = null;
    }
}
