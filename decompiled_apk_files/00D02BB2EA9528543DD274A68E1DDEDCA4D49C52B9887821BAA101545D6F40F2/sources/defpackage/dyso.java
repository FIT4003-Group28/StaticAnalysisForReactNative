package defpackage;

import java.io.InputStream;
/* compiled from: PG */
/* renamed from: dyso  reason: default package */
/* loaded from: classes6.dex */
final class dyso implements dyvk {
    private InputStream a;

    public dyso(InputStream inputStream) {
        this.a = inputStream;
    }

    @Override // defpackage.dyvk
    @dzsi
    public final InputStream o() {
        InputStream inputStream = this.a;
        this.a = null;
        return inputStream;
    }
}
