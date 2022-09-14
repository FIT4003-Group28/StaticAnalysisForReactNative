package a;

import java.util.Locale;
/* compiled from: CancellationToken.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final e f9a;

    public boolean a() {
        return this.f9a.a();
    }

    public String toString() {
        return String.format(Locale.US, "%s@%s[cancellationRequested=%s]", getClass().getName(), Integer.toHexString(hashCode()), Boolean.toString(this.f9a.a()));
    }
}
