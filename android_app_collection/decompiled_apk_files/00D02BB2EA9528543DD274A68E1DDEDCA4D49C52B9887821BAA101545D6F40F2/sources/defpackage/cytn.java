package defpackage;

import com.google.android.libraries.social.populous.core.AutocompletionCallbackMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cytn  reason: default package */
/* loaded from: classes5.dex */
public abstract class cytn {
    public abstract AutocompletionCallbackMetadata a();

    public abstract cyto b();

    public abstract void c(@dzsi AutocompletionCallbackMetadata autocompletionCallbackMetadata);

    public abstract void d(boolean z);

    public abstract void e(dcdc<cyvs> dcdcVar);

    public abstract void f(boolean z);

    public abstract void g(int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final cyto h() {
        if (a() == null) {
            c(AutocompletionCallbackMetadata.e().a());
        }
        return b();
    }
}
