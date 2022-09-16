package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dzvy  reason: default package */
/* loaded from: classes6.dex */
public class dzvy<R> implements Serializable {
    public final String toString() {
        int i = dzwe.a;
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        dzvx.b(obj, "Reflection.renderLambdaToString(this)");
        return obj;
    }
}
