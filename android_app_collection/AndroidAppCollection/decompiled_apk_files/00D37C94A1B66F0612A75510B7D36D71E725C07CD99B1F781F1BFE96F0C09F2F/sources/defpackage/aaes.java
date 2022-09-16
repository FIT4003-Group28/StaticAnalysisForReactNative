package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: aaes  reason: default package */
/* loaded from: classes.dex */
public final class aaes extends aaec {
    public final azqb a;
    public final azqb b;
    private final ankw c;

    public aaes(tpp tppVar, ankw ankwVar, azqb azqbVar, azqb azqbVar2) {
        super(tppVar, azqbVar2);
        this.c = ankwVar;
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    @Override // defpackage.aaev
    public final ankt d() {
        if (!a().containsKey("tf-lite-bandwidth-model.tflite")) {
            ((aaeo) this.b.get()).b(aqkb.DATA_PUSH_CLIENT_EVENT_TYPE_FILE_NOT_FOUND, b());
            return anlz.p(new IOException("File not found: tf-lite-bandwidth-model.tflite"));
        }
        final String str = (String) a().get("tf-lite-bandwidth-model.tflite");
        return this.c.qp(new Callable() { // from class: aaer
            @Override // java.util.concurrent.Callable
            public final Object call() {
                aaes aaesVar = aaes.this;
                try {
                    return ((vjb) aaesVar.a.get()).c(Uri.parse(str), new vkg(2));
                } catch (IOException e) {
                    ((aaeo) aaesVar.b.get()).b(aqkb.DATA_PUSH_CLIENT_EVENT_TYPE_FILE_READ_BYTES_FAILED, aaesVar.b());
                    throw e;
                }
            }
        });
    }
}
