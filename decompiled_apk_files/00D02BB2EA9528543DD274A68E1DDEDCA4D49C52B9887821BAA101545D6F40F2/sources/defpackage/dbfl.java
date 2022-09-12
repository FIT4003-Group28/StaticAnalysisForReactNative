package defpackage;

import java.util.concurrent.CompletionException;
import java.util.function.Function;
/* renamed from: dbfl  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class dbfl implements Function {
    static final Function a = new dbfl();

    private dbfl() {
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        throw new CompletionException((Throwable) obj);
    }
}
