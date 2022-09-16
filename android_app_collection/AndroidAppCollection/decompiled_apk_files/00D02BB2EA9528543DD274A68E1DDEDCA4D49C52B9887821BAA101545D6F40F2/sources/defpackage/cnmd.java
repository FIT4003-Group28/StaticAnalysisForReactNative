package defpackage;

import android.os.Bundle;
import java.io.IOException;
/* renamed from: cnmd  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class cnmd implements cpbu {
    public static final cpbu a = new cnmd();

    private cnmd() {
    }

    @Override // defpackage.cpbu
    public final Object a(cpcq cpcqVar) {
        if (!cpcqVar.b()) {
            throw new IOException("SERVICE_NOT_AVAILABLE", cpcqVar.e());
        }
        return (Bundle) cpcqVar.d();
    }
}
