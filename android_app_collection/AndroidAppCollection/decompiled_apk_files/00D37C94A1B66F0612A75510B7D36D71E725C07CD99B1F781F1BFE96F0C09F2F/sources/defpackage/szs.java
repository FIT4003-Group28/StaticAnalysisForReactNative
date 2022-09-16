package defpackage;

import com.google.android.libraries.elements.interfaces.JSFutureHandler;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: szs  reason: default package */
/* loaded from: classes4.dex */
public final class szs extends JSFutureHandler {
    public aysm a;

    public szs(aysm aysmVar) {
        this.a = aysmVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.JSFutureHandler
    public final void onError(String str) {
        aysm aysmVar = this.a;
        if (aysmVar == null) {
            return;
        }
        aysmVar.c(new ted(str));
    }

    @Override // com.google.android.libraries.elements.interfaces.JSFutureHandler
    public final void onSuccess() {
        aysm aysmVar = this.a;
        if (aysmVar == null) {
            return;
        }
        aysmVar.a();
    }
}
