package defpackage;

import android.content.res.Resources;
import java.io.Serializable;
/* compiled from: PG */
/* renamed from: bths  reason: default package */
/* loaded from: classes4.dex */
public abstract class bths implements Serializable {
    public static final dbrz a = dbrz.e("\n\n");

    public static bthq h() {
        return new btha();
    }

    public static String i(Resources resources, int... iArr) {
        dccx dccxVar = new dccx();
        for (int i : iArr) {
            dccxVar.g(resources.getString(i));
        }
        return a.g(dccxVar.f());
    }

    public abstract String a();

    public abstract String b();

    public abstract dbsg<String> c();

    public abstract String d();

    public abstract ddho e();

    public abstract bthr f();

    public abstract cjtd g();
}
