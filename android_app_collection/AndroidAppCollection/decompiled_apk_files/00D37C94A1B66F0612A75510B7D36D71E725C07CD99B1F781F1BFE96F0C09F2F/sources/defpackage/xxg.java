package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: xxg  reason: default package */
/* loaded from: classes4.dex */
public final class xxg implements akuk {
    public boolean a = false;
    private final /* synthetic */ int b;

    public xxg() {
    }

    public xxg(int i) {
        this.b = i;
    }

    @Override // defpackage.akuk
    public final void d(Bundle bundle) {
    }

    @Override // defpackage.akuk
    public final void a(String str, Bundle bundle) {
        if (this.b != 0) {
            if (!this.a) {
                return;
            }
            bundle.putString("has_viewed_stories_on_home", "YES");
        } else if (!this.a) {
        } else {
            bundle.putString("has_viewed_community_posts_on_home", "YES");
        }
    }
}
