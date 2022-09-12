package defpackage;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.function.Function;
/* compiled from: PG */
/* renamed from: dbew  reason: default package */
/* loaded from: classes5.dex */
public final class dbew {
    public static <T> void a(String str, CompletableFuture<T> completableFuture, String str2) {
        completableFuture.exceptionally((Function) new Function() { // from class: dbev
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                throw new CompletionException((Throwable) obj);
            }
        });
    }
}
