package defpackage;

import com.google.geo.imagery.viewer.api.Tile;
import com.google.geo.imagery.viewer.api.TileRequest;
import com.google.geo.imagery.viewer.api.TileRequestContainer;
import com.google.geo.imagery.viewer.api.TileService;
import com.google.geo.imagery.viewer.api.TileServiceSwigJNI;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bwvh  reason: default package */
/* loaded from: classes4.dex */
public final class bwvh extends TileService {
    public final dfuh a;
    private final duux c;
    private final bwus d;

    public bwvh(dfuh dfuhVar, ckqm ckqmVar, bwzi bwziVar, duux duuxVar, bvrb bvrbVar) {
        this.d = new bwus(ckqmVar, bwziVar, bvrbVar);
        this.a = dfuhVar;
        this.c = duuxVar;
    }

    private static String a(Tile tile, duux duuxVar) {
        dgge dggeVar;
        dftd dftdVar = tile.d;
        if (dftdVar == null) {
            dftdVar = dftd.d;
        }
        int a = dfsm.a(dftdVar.b);
        if (a == 0) {
            a = 1;
        }
        if (a == 2) {
            dggeVar = dgge.IMAGE_ALLEYCAT;
        } else if (a == 3) {
            dggeVar = dgge.IMAGE_FIFE;
        } else if (a == 4) {
            dggeVar = dgge.IMAGE_CONTENT_FIFE;
        } else if (a == 7) {
            dggeVar = dgge.MEDIA_GUESSABLE_FIFE;
        } else {
            dggeVar = dgge.IMAGE_UNKNOWN;
        }
        for (int i = 0; i < duuxVar.b.size(); i++) {
            dgge b = dgge.b(duuxVar.b.get(i).a);
            if (b == null) {
                b = dgge.IMAGE_UNKNOWN;
            }
            if (b == dggeVar) {
                String str = duuxVar.b.get(i).b;
                dftd dftdVar2 = tile.d;
                if (dftdVar2 == null) {
                    dftdVar2 = dftd.d;
                }
                return str.replace("{id}", dftdVar2.c).replace("{product_id}", duuxVar.a).replace("{zoom}", Integer.toString(tile.c)).replace("{x}", Integer.toString(tile.a)).replace("{y}", Integer.toString(tile.b));
            }
        }
        return "";
    }

    @Override // com.google.geo.imagery.viewer.api.TileService
    public final void cancel(Tile tile) {
        bwus bwusVar = this.d;
        String a = a(tile, this.c);
        if (dbsj.d(a)) {
            return;
        }
        bwusVar.b(a);
    }

    @Override // com.google.geo.imagery.viewer.api.TileService
    public final void request(TileRequest tileRequest) {
        Tile tile;
        TileRequestContainer tileRequestContainer = new TileRequestContainer(TileServiceSwigJNI.new_RequestContainer(TileRequest.a(tileRequest), tileRequest));
        byte[] TileRequestContainer_rawRequest = TileServiceSwigJNI.TileRequestContainer_rawRequest(tileRequestContainer.a, tileRequestContainer);
        if (TileRequestContainer_rawRequest == null) {
            tile = null;
        } else {
            try {
                tile = (Tile) dsqw.cq(Tile.e, TileRequestContainer_rawRequest);
            } catch (dsrm e) {
                throw new RuntimeException("Unable to parse com.google.geo.imagery.viewer.api.Tile protocol message.", e);
            }
        }
        this.d.a(new bwvg(this, tileRequestContainer), a(tile, this.c));
    }
}
