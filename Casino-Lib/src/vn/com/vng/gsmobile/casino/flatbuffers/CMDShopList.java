// automatically generated by the FlatBuffers compiler, do not modify

package vn.com.vng.gsmobile.casino.flatbuffers;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class CMDShopList extends Table {
  public static CMDShopList getRootAsCMDShopList(ByteBuffer _bb) { return getRootAsCMDShopList(_bb, new CMDShopList()); }
  public static CMDShopList getRootAsCMDShopList(ByteBuffer _bb, CMDShopList obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public CMDShopList __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public long uid() { int o = __offset(4); return o != 0 ? bb.getLong(o + bb_pos) : 0; }
  public boolean mutateUid(long uid) { int o = __offset(4); if (o != 0) { bb.putLong(o + bb_pos, uid); return true; } else { return false; } }
  public int updateFlag() { int o = __offset(6); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean mutateUpdateFlag(int update_flag) { int o = __offset(6); if (o != 0) { bb.put(o + bb_pos, (byte)update_flag); return true; } else { return false; } }
  public ShopItem listItem(int j) { return listItem(new ShopItem(), j); }
  public ShopItem listItem(ShopItem obj, int j) { int o = __offset(8); return o != 0 ? obj.__init(__indirect(__vector(o) + j * 4), bb) : null; }
  public int listItemLength() { int o = __offset(8); return o != 0 ? __vector_len(o) : 0; }

  public static int createCMDShopList(FlatBufferBuilder builder,
      long uid,
      int update_flag,
      int list_itemOffset) {
    builder.startObject(3);
    CMDShopList.addUid(builder, uid);
    CMDShopList.addListItem(builder, list_itemOffset);
    CMDShopList.addUpdateFlag(builder, update_flag);
    return CMDShopList.endCMDShopList(builder);
  }

  public static void startCMDShopList(FlatBufferBuilder builder) { builder.startObject(3); }
  public static void addUid(FlatBufferBuilder builder, long uid) { builder.addLong(0, uid, 0); }
  public static void addUpdateFlag(FlatBufferBuilder builder, int updateFlag) { builder.addByte(1, (byte)updateFlag, 0); }
  public static void addListItem(FlatBufferBuilder builder, int listItemOffset) { builder.addOffset(2, listItemOffset, 0); }
  public static int createListItemVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startListItemVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endCMDShopList(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}
