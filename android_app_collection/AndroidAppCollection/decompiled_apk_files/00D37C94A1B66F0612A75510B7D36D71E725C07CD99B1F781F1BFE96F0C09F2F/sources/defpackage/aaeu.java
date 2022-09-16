package defpackage;

import android.content.Context;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aaeu  reason: default package */
/* loaded from: classes.dex */
public final class aaeu extends aaec {
    public final Context a;
    private final ankw b;
    private final azqb c;

    public aaeu(Context context, tpp tppVar, ankw ankwVar, azqb azqbVar) {
        super(tppVar, azqbVar);
        this.a = context;
        this.b = ankwVar;
        this.c = azqbVar;
    }

    @Override // defpackage.aaev
    public final ankt d() {
        Callable callable = new Callable() { // from class: aaet
            @Override // java.util.concurrent.Callable
            public final Object call() {
                aaeu aaeuVar = aaeu.this;
                byte[] c = anek.c(aaeuVar.a.getAssets().open((String) aaeuVar.a().get("tf-lite-bandwidth-model.tflite")));
                return ByteBuffer.allocateDirect(c.length).put(c);
            }
        };
        if (!a().containsKey("tf-lite-bandwidth-model.tflite")) {
            ((aaeo) this.c.get()).b(aqkb.DATA_PUSH_CLIENT_EVENT_TYPE_FILE_NOT_FOUND, b());
            return anlz.p(new IOException("File not found: tf-lite-bandwidth-model.tflite"));
        }
        return this.b.qp(callable);
    }
}
