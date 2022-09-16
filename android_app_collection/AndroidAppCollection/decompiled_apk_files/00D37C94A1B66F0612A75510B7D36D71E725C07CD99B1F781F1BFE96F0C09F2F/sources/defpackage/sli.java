package defpackage;

import android.os.RemoteException;
/* compiled from: PG */
/* renamed from: sli  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class sli implements ampg {
    public final /* synthetic */ smr a;
    private final /* synthetic */ int b;

    public /* synthetic */ sli(smr smrVar) {
        this.a = smrVar;
    }

    public /* synthetic */ sli(smr smrVar, int i) {
        this.b = i;
        this.a = smrVar;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        if (this.b == 0) {
            try {
                ((dwh) obj).b(this.a);
                return null;
            } catch (RemoteException e) {
                ((amzw) ((amzw) ((amzw) sll.a.f()).h(e)).i("com/google/android/libraries/assistant/appintegration/AssistantConnector", "lambda$sendData$2", (char) 131, "AssistantConnector.java")).q("Can't send data");
                return null;
            }
        }
        return Boolean.valueOf(((dwh) obj).c(this.a));
    }
}
