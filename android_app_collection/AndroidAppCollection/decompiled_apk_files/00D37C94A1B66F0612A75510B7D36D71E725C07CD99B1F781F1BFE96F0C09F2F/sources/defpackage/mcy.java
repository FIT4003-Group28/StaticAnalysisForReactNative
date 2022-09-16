package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.util.Map;
/* compiled from: PG */
/* renamed from: mcy  reason: default package */
/* loaded from: classes3.dex */
public final class mcy implements aafl {
    public final mcj a;
    private final acth b;
    private final azqb c;

    public mcy(mcj mcjVar, acth acthVar, azqb azqbVar) {
        this.a = mcjVar;
        this.b = acthVar;
        this.c = azqbVar;
    }

    private static View b(View view) {
        if (view.getTag(R.id.elements_image) instanceof awny) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View b = b(viewGroup.getChildAt(i));
            if (b != null) {
                return b;
            }
        }
        return null;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        View view;
        View b;
        avhn avhnVar;
        if (!apzgVar.qn(InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand.inlineMutedWatchEndpointMutationCommand)) {
            return;
        }
        apzg apzgVar2 = ((InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand) apzgVar.qm(InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand.inlineMutedWatchEndpointMutationCommand)).b;
        if (apzgVar2 == null) {
            apzgVar2 = apzg.a;
        }
        if (map != null && (view = (View) map.get("com.google.android.libraries.youtube.rendering.elements.sender_view")) != null && (b = b(view)) != null) {
            map.put("VideoPresenterConstants.VIDEO_THUMBNAIL_VIEW_KEY", b);
            Object tag = b.getTag(R.id.elements_image);
            if (!(tag instanceof awny)) {
                avhnVar = null;
            } else {
                aopc aopcVar = (aopc) avhn.a.createBuilder();
                for (awoa awoaVar : ((awny) tag).c) {
                    aopa createBuilder = avhm.a.createBuilder();
                    String str = "";
                    String str2 = true != (awoaVar.c == 1 ? (String) awoaVar.d : str).startsWith("//") ? str : "https:";
                    if (awoaVar.c == 1) {
                        str = (String) awoaVar.d;
                    }
                    String valueOf = String.valueOf(str);
                    String concat = valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
                    createBuilder.copyOnWrite();
                    avhm avhmVar = (avhm) createBuilder.instance;
                    concat.getClass();
                    avhmVar.b = 1 | avhmVar.b;
                    avhmVar.c = concat;
                    int i = awoaVar.e;
                    createBuilder.copyOnWrite();
                    avhm avhmVar2 = (avhm) createBuilder.instance;
                    avhmVar2.b |= 2;
                    avhmVar2.d = i;
                    int i2 = awoaVar.f;
                    createBuilder.copyOnWrite();
                    avhm avhmVar3 = (avhm) createBuilder.instance;
                    avhmVar3.b |= 4;
                    avhmVar3.e = i2;
                    aopcVar.cw(createBuilder);
                }
                avhnVar = (avhn) aopcVar.mo39build();
            }
            map.put("VideoPresenterConstants.VIDEO_THUMBNAIL_DETAILS_KEY", avhnVar);
        }
        ghl n = ghm.n();
        n.i = 4;
        n.d = apzgVar2;
        n.b = ((awel) apzgVar2.qm(WatchEndpointOuterClass.watchEndpoint)).c;
        final ghm a = n.a();
        if (this.a.b(a, (aafo) this.c.get(), this.b.oi(), map, new ajrn() { // from class: mcx
            @Override // defpackage.ajrn
            public final void oq(Map map2) {
                mcy mcyVar = mcy.this;
                mcyVar.a.a(a, map2);
            }
        })) {
            return;
        }
        ((aafo) this.c.get()).c(this.b.oi().f(apzgVar2), map);
    }
}
