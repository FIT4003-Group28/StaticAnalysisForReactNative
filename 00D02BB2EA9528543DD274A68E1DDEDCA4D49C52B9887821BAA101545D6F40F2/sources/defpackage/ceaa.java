package defpackage;

import android.content.res.Resources;
import android.widget.EditText;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ceaa  reason: default package */
/* loaded from: classes4.dex */
final class ceaa<T> implements aa<Integer> {
    final /* synthetic */ ceae a;

    public ceaa(ceae ceaeVar) {
        this.a = ceaeVar;
    }

    @Override // defpackage.aa
    public final /* bridge */ /* synthetic */ void m(Integer num) {
        Integer num2 = num;
        ceae ceaeVar = this.a;
        EditText editText = ceaeVar.aj;
        if (editText != null) {
            ff J = ceaeVar.J();
            if (J == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            Resources resources = J.getResources();
            dzvx.b(num2, "it");
            editText.setHint(resources.getQuantityString(R.plurals.photo_posts_comment_hint_2, num2.intValue()));
        }
    }
}
