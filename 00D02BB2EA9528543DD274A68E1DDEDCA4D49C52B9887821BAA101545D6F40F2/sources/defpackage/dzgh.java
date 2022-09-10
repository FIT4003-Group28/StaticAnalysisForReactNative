package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dzgh  reason: default package */
/* loaded from: classes6.dex */
public final class dzgh {
    public static final dyzz a;
    static final dyzz b;

    static {
        dzgg dzggVar = new dzgg();
        dzba<? super Callable<dyzz>, ? extends dyzz> dzbaVar = dzfy.d;
        a = dzfy.b(dzggVar);
        dzga dzgaVar = new dzga();
        dzba<? super Callable<dyzz>, ? extends dyzz> dzbaVar2 = dzfy.c;
        b = dzfy.b(dzgaVar);
        dzgb dzgbVar = new dzgb();
        dzba<? super Callable<dyzz>, ? extends dyzz> dzbaVar3 = dzfy.e;
        dzfy.b(dzgbVar);
        int i = dzfg.a;
        dzge dzgeVar = new dzge();
        dzba<? super Callable<dyzz>, ? extends dyzz> dzbaVar4 = dzfy.f;
        dzfy.b(dzgeVar);
    }

    public static dyzz a() {
        dyzz dyzzVar = b;
        dzba<? super dyzz, ? extends dyzz> dzbaVar = dzfy.g;
        return dyzzVar;
    }

    public static dyzz b(Executor executor) {
        return new dzem(executor);
    }
}
