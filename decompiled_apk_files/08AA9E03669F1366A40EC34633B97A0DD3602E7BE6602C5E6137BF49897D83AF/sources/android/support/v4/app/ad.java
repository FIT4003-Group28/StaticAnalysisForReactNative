package android.support.v4.app;

import android.app.RemoteInput;
import android.os.Bundle;
import java.util.Set;
/* compiled from: RemoteInput.java */
/* loaded from: classes.dex */
public final class ad {

    /* renamed from: a  reason: collision with root package name */
    private final String f199a;

    /* renamed from: b  reason: collision with root package name */
    private final CharSequence f200b;

    /* renamed from: c  reason: collision with root package name */
    private final CharSequence[] f201c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f202d;
    private final Bundle e;
    private final Set<String> f;

    public String a() {
        return this.f199a;
    }

    public CharSequence b() {
        return this.f200b;
    }

    public CharSequence[] c() {
        return this.f201c;
    }

    public Set<String> d() {
        return this.f;
    }

    public boolean e() {
        return this.f202d;
    }

    public Bundle f() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static RemoteInput[] a(ad[] adVarArr) {
        if (adVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[adVarArr.length];
        for (int i = 0; i < adVarArr.length; i++) {
            remoteInputArr[i] = a(adVarArr[i]);
        }
        return remoteInputArr;
    }

    static RemoteInput a(ad adVar) {
        return new RemoteInput.Builder(adVar.a()).setLabel(adVar.b()).setChoices(adVar.c()).setAllowFreeFormInput(adVar.e()).addExtras(adVar.f()).build();
    }
}
