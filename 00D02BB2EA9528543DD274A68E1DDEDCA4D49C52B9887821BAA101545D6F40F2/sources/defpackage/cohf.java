package defpackage;

import android.content.Context;
import com.google.android.gms.learning.examplestoreimpl.defaultimpl.DefaultExampleStoreDataTtlService;
import java.util.Random;
/* compiled from: PG */
/* renamed from: cohf  reason: default package */
/* loaded from: classes5.dex */
public final class cohf {
    private static final cqat a = new cqaz();
    private static final Random b = new Random();
    private static final dehp c;
    private static final Object d;
    private static cogy e;

    static {
        coiz coizVar = coja.a;
        deip deipVar = new deip();
        deipVar.a = "BrellaExmplStor-%d";
        c = dehx.c(coiz.b(deip.a(deipVar)));
        d = new Object();
    }

    public static cogy a(Context context) {
        cogy cogyVar;
        Context applicationContext = context.getApplicationContext();
        synchronized (d) {
            if (e == null) {
                cqat cqatVar = a;
                Random random = b;
                dehp dehpVar = c;
                e = new cogy(applicationContext, new cohd(applicationContext, cqatVar, random, dehpVar), dehpVar, DefaultExampleStoreDataTtlService.class);
            }
            cogyVar = e;
        }
        return cogyVar;
    }
}
