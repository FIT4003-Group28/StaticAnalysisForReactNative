package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.text.DecimalFormat;
/* compiled from: PG */
/* renamed from: ahgh  reason: default package */
/* loaded from: classes.dex */
public class ahgh {
    private static final avwa[] a = new avwa[0];
    private final boolean b;
    private final avwa[] c;
    private final float d;

    public ahgh(boolean z, PlayerResponseModel playerResponseModel, float f) {
        this.b = z;
        this.c = d(playerResponseModel);
        this.d = f;
    }

    public static avwa[] d(PlayerResponseModel playerResponseModel) {
        if (playerResponseModel == null) {
            return a;
        }
        PlayerConfigModel c = playerResponseModel.c();
        avwb avwbVar = c.c.t;
        if (avwbVar == null) {
            avwbVar = avwb.a;
        }
        if (avwbVar.b.size() == 0) {
            DecimalFormat decimalFormat = new DecimalFormat("0.0#");
            avwa[] avwaVarArr = new avwa[7];
            for (int i = 0; i < 7; i++) {
                aopa createBuilder = avwa.a.createBuilder();
                float f = PlayerConfigModel.a[i];
                aopc aopcVar = (aopc) arag.a.createBuilder();
                aopc aopcVar2 = (aopc) arai.a.createBuilder();
                String format = decimalFormat.format(f);
                aopcVar2.copyOnWrite();
                arai araiVar = (arai) aopcVar2.instance;
                format.getClass();
                araiVar.b |= 1;
                araiVar.c = format;
                aopcVar.ch((arai) aopcVar2.mo39build());
                createBuilder.copyOnWrite();
                avwa avwaVar = (avwa) createBuilder.instance;
                arag aragVar = (arag) aopcVar.mo39build();
                aragVar.getClass();
                avwaVar.c = aragVar;
                avwaVar.b |= 1;
                createBuilder.copyOnWrite();
                avwa avwaVar2 = (avwa) createBuilder.instance;
                avwaVar2.b |= 2;
                avwaVar2.d = f;
                avwaVarArr[i] = (avwa) createBuilder.mo39build();
            }
            return avwaVarArr;
        }
        avwb avwbVar2 = c.c.t;
        if (avwbVar2 == null) {
            avwbVar2 = avwb.a;
        }
        return (avwa[]) avwbVar2.b.toArray(new avwa[0]);
    }

    public float a() {
        return this.d;
    }

    public String b() {
        avwa[] avwaVarArr;
        for (avwa avwaVar : this.c) {
            if (avwaVar.d == this.d) {
                arag aragVar = avwaVar.c;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
                return ((arai) aragVar.c.get(0)).c;
            }
        }
        return null;
    }

    public avwa[] c() {
        return this.c;
    }
}
