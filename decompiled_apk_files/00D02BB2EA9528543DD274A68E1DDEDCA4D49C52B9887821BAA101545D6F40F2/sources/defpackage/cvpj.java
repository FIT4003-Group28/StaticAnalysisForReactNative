package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cvpj  reason: default package */
/* loaded from: classes5.dex */
public final class cvpj {
    public static final Executor a = new cvph();

    public static <T> void a(cpcq<T> cpcqVar) {
        if (cpcqVar.b()) {
            cpcqVar.d();
        } else if (cpcqVar.c()) {
            throw new CancellationException("Task is already cancelled.");
        } else {
            throw new ExecutionException(cpcqVar.e());
        }
    }
}
