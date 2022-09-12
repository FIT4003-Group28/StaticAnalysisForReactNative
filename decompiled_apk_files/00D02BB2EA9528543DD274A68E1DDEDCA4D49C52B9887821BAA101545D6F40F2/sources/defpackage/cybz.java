package defpackage;

import com.google.android.libraries.social.populous.core.AutoValue_GroupOrigin;
import com.google.android.libraries.social.populous.core.GroupOrigin;
import com.google.android.libraries.social.populous.core.Name;
import com.google.android.libraries.social.populous.core.Photo;
/* compiled from: PG */
/* renamed from: cybz  reason: default package */
/* loaded from: classes5.dex */
public final class cybz extends cyfh {
    public String a;
    public Name b;
    public Photo c;

    @Override // defpackage.cyfh
    public final GroupOrigin a() {
        return new AutoValue_GroupOrigin(this.a, this.b, this.c);
    }
}
