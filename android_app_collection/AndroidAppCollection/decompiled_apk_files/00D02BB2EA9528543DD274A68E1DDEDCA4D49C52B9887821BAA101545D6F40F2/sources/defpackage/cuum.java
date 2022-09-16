package defpackage;

import android.graphics.Bitmap;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import com.google.android.libraries.messaging.lighter.ui.avatar.AnonymousConversationAvatarView;
import java.util.Arrays;
/* renamed from: cuum  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class cuum {
    private final AnonymousConversationAvatarView a;

    public cuum(AnonymousConversationAvatarView anonymousConversationAvatarView) {
        this.a = anonymousConversationAvatarView;
    }

    public final Bitmap a(cufp cufpVar, dbsg dbsgVar, int i, boolean z) {
        AnonymousConversationAvatarView anonymousConversationAvatarView = this.a;
        if (cufpVar.d().a()) {
            return anonymousConversationAvatarView.a.c(Arrays.asList(cufpVar.d().b()), i);
        }
        if (cufpVar.a().c() != ConversationId.IdType.ONE_TO_ONE || !dbsgVar.a()) {
            if (!anonymousConversationAvatarView.j.a() || ((Boolean) anonymousConversationAvatarView.j.b().second).booleanValue() != z) {
                int hashCode = cufpVar.a().hashCode();
                if (cufpVar.b().a()) {
                    hashCode = cufpVar.b().b().hashCode();
                }
                cuuv cuuvVar = anonymousConversationAvatarView.a;
                Bitmap[] bitmapArr = new Bitmap[1];
                int[] iArr = anonymousConversationAvatarView.d;
                bitmapArr[0] = cuuvVar.b(iArr[Math.abs(hashCode % iArr.length)], anonymousConversationAvatarView.getContext().getDrawable(2131232062), z ? anonymousConversationAvatarView.f : anonymousConversationAvatarView.e, i);
                return cuuvVar.c(Arrays.asList(bitmapArr), i);
            }
            return (Bitmap) anonymousConversationAvatarView.j.b().first;
        }
        return anonymousConversationAvatarView.e((cufj) dbsgVar.b(), z);
    }
}
