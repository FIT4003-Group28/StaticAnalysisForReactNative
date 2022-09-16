package defpackage;

import java.util.concurrent.CompletionException;
import java.util.function.Function;
/* renamed from: dbfo  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class dbfo implements Function {
    static final Function a = new dbfo();

    private dbfo() {
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        throw new CompletionException("Texture Load Error", (Throwable) obj);
    }
}
