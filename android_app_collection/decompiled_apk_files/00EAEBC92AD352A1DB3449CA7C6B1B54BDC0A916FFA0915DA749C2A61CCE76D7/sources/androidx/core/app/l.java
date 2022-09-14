package androidx.core.app;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.Set;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final String f1557a;

    /* renamed from: b  reason: collision with root package name */
    private final CharSequence f1558b;

    /* renamed from: c  reason: collision with root package name */
    private final CharSequence[] f1559c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f1560d;

    /* renamed from: e  reason: collision with root package name */
    private final int f1561e;

    /* renamed from: f  reason: collision with root package name */
    private final Bundle f1562f;

    /* renamed from: g  reason: collision with root package name */
    private final Set<String> f1563g;

    static RemoteInput a(l lVar) {
        RemoteInput.Builder addExtras = new RemoteInput.Builder(lVar.g()).setLabel(lVar.f()).setChoices(lVar.c()).setAllowFreeFormInput(lVar.a()).addExtras(lVar.e());
        if (Build.VERSION.SDK_INT >= 29) {
            addExtras.setEditChoicesBeforeSending(lVar.d());
        }
        return addExtras.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static RemoteInput[] a(l[] lVarArr) {
        if (lVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[lVarArr.length];
        for (int i = 0; i < lVarArr.length; i++) {
            remoteInputArr[i] = a(lVarArr[i]);
        }
        return remoteInputArr;
    }

    public boolean a() {
        return this.f1560d;
    }

    public Set<String> b() {
        return this.f1563g;
    }

    public CharSequence[] c() {
        return this.f1559c;
    }

    public int d() {
        return this.f1561e;
    }

    public Bundle e() {
        return this.f1562f;
    }

    public CharSequence f() {
        return this.f1558b;
    }

    public String g() {
        return this.f1557a;
    }

    public boolean h() {
        return !a() && (c() == null || c().length == 0) && b() != null && !b().isEmpty();
    }
}
